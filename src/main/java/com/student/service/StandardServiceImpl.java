package com.student.service;

import com.student.entity.Standard;
import com.student.repository.StandardRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

//import java.awt.print.Pageable;
import java.util.List;


@Service
public class StandardServiceImpl implements StandardService {
    @Autowired
    StandardRepository standardRepository;

    @Override
    public String saveStandard(Standard standard) {

        standardRepository.save(standard);
        return "data posted successfully";

    }


    @Override
    public Standard getAStandard (ObjectId id) {
        Standard standard = standardRepository.findById(id).orElse(null);

        if (standard != null) {
            return standard;
        } else {
            throw new RuntimeException("Standard not found with id: " + id);
        }

    }


    @Override
    public String updateStandard(ObjectId id,  Standard updatedStandard) {
        Standard existingStandard = standardRepository.findById(id).orElse(null);

        if (existingStandard == null) {
            throw new RuntimeException("Standard not found with id: " + id);
        }



        if (updatedStandard.getName() != null) {
            existingStandard.setName(updatedStandard.getName());
        }
        if (updatedStandard.getRank() != null) {
            existingStandard.setRank(updatedStandard.getRank());
        }


        standardRepository.save(existingStandard);

        return "Standard updated successfully";
    }


    @Override
    public String deleteStandard(ObjectId id) {

        Standard existingStandard = standardRepository.findById(id).orElse(null);

        if (existingStandard == null) {
            throw new RuntimeException("Standard not found with id: " + id);
        }

        standardRepository.deleteById(id);

        return "Standard deleted successfully";
    }


    @Override
    public Standard topStudent() {

        return standardRepository.findTopByOrderByRankAsc();

    }














}

