package com.student.controller;

import com.student.entity.Standard;
import com.student.service.StandardService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/standard")
public class StandardController {

    @Autowired
    StandardService standardService;


    @GetMapping("/getadata/{id}")
    public Standard getAStandardById(@PathVariable ObjectId id)
    {

        return standardService.getAStandard(id);
    }

    @PostMapping("/postadata")
    public String createStandardDetails(@RequestBody Standard standard) {
        return standardService.saveStandard(standard);
    }

    @PutMapping("/updateadata/{id}")
    public String updateStandardDetails(@PathVariable ObjectId id, @RequestBody Standard updatedStandard) {
        return standardService.updateStandard(id, updatedStandard);
    }



    @DeleteMapping("/deleteadata/{id}")
    public String deleteStandardDetails(@PathVariable ObjectId id) {

        return standardService.deleteStandard(id);
    }

    @GetMapping("/gettoprank")
    public Standard getTopRankedStudent()
    {

        return standardService.topStudent();
    }




}
