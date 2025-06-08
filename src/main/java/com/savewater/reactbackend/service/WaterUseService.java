package com.savewater.reactbackend.service;
import com.savewater.reactbackend.model.WaterUse;
import java.util.List;
import com.savewater.reactbackend.model.TaskInput;
import org.springframework.stereotype.Service;

@Service
public class WaterUseService {

    public double calculateTotalWaterUse(List<TaskInput> tasks) {
        double totalGallons = 0;
        for (TaskInput task : tasks) {
            String taskName = task.getTaskName();
            double minutes = task.getMinutes();

            switch(taskName) {
                case "Washing your car":
                    totalGallons += WaterUse.washingCar(minutes);
                    break;
                case "Washing Patio":
                    totalGallons += WaterUse.washingPatio(minutes);
                    break;
                case "Using Hose":
                    totalGallons += WaterUse.hose(minutes);
                    break;
                case "Cloth Washing Machine":
                    totalGallons += WaterUse.washingMachine(minutes);
                    break;
                case "Taking a Shower":
                    totalGallons += WaterUse.shower(minutes);
                    break;
                case "Washing Dishes by hand":
                    totalGallons += WaterUse.handDishes(minutes);
                    break;
                case "Brushing your Teeth":
                    totalGallons += WaterUse.brushingTeeth(minutes);
                    break;
                case "Washing your hands":
                    totalGallons += WaterUse.Handwashing(minutes);
                    break;
                case "Watering Plants":
                    totalGallons += WaterUse.wateringPlants(minutes);
                    break;
                case "Using the toilet":
                    totalGallons += WaterUse.toilet();
                    break;
                case "Taking a bath":
                    totalGallons += WaterUse.bath();
                    break;
                case "Cooking":
                    totalGallons += WaterUse.cooking();
                    break;
                case "Cleaning":
                    totalGallons += WaterUse.cleaning();
                    break;
                case "Filling a swimming pool":
                    totalGallons += WaterUse.pool();
                    break;
                case "Dishwasher":
                    totalGallons += WaterUse.dishwasher();
                    break;
                default:
                    break;
            }
        }
        return totalGallons;
    }
}