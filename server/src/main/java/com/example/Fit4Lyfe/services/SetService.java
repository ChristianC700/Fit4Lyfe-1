package com.example.Fit4Lyfe.services;

import com.example.Fit4Lyfe.dtos.SetRequest;
import com.example.Fit4Lyfe.dtos.SetResponse;
import com.example.Fit4Lyfe.models.Set;
import com.example.Fit4Lyfe.repositories.SetRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//UserService handles business logic for the User resource
@Service //Essentially a @Component annotation
@Slf4j //Enables logging capabilities
public class SetService {

    @Autowired //injects userRepository bean from the application context
    private SetRepository setRepository;

    @Transactional
    public SetResponse createSet(SetRequest setRequest) {
        Set set = Set.builder()
                .numOfReps(setRequest.getNumOfReps()).build();

        setRepository.save(set);
        log.info("User {} created.", set.getId());

        return this.mapToSetResponse(set);
    }
    public List<SetResponse> getAllSets() {
        log.info("Successfully retrieved all sets.");
        return setRepository.findAll().stream().map(this::mapToSetResponse).toList();
    }

    public SetResponse getSetById(long id) {
        return setRepository.findById(id).map(this::mapToSetResponse).orElseThrow(EntityNotFoundException::new);
    }

    private SetResponse mapToSetResponse(Set set) {
        return SetResponse.builder()
                .id(set.getId())
                .numOfReps(set.getNumOfReps()).build();
    }
}
