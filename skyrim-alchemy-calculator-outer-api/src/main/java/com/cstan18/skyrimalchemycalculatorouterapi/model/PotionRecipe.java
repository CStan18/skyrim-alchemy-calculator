package com.cstan18.skyrimalchemycalculatorouterapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Data
@AllArgsConstructor
public class PotionRecipe {
    private String ingredient1Name;
    private String ingredient2Name;
    private List<String> commonEffects;
    private double value;

}
