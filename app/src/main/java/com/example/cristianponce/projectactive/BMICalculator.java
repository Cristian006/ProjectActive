package com.example.cristianponce.projectactive;

/**
 * Created by Cristian Ponce on 9/16/2016.
 */
public class BMICalculator {
    void CalculateWomenBMI(float bodyWeight, float wristMeasurement, float waistMeasurement, float hipMeasurement, float forearmMeasurement){
        float factor1 = (bodyWeight * 0.732f)+8.987f;
        float factor2 = (wristMeasurement)/3.140f;
        float factor3 = (waistMeasurement)*0.157f;
        float factor4 = hipMeasurement*0.249f;
        float factor5 = forearmMeasurement*0.434f;
        float leanBodyMass = factor1 + factor2 - factor3 - factor4 + factor5;
        float bodyFatWeight = bodyWeight - leanBodyMass;
        float bodyFatPercentage = (bodyFatWeight * 100.0f) / bodyWeight;
    }

    void CalculateMenBMI(float bodyWeight, float waistMeasurement){
        float factor1 = (bodyWeight * 1.082f) + 94.42f;
        float factor2 = waistMeasurement * 4.15f;
        float leanBodyMass = factor1 - factor2;
        float bodyFatWeight = bodyWeight - leanBodyMass;
        float bodyFatPercentage = (bodyFatWeight * 100.0f)/ bodyWeight;
    }
}
