package com.savewater.reactbackend.controller;
import com.savewater.reactbackend.model.TaskInput;
import com.savewater.reactbackend.service.WaterUseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wateruse")
@CrossOrigin(origins = "http://localhost:3000")
public class WaterUseController {

    @Autowired
    private WaterUseService waterUseService;

    @PostMapping("/calculateTotal")
    @CrossOrigin(origins = "http://localhost:3000")
    public double calculateTotalWaterUse(@RequestBody List<TaskInput> taskInputs) {
        return waterUseService.calculateTotalWaterUse(taskInputs);
    }
}
