package model;

import lombok.Builder;
import lombok.Data;

/**
 * @author Igor Hnes on 9/14/17.
 */

@Data
@Builder
public class PowerBank extends AbstractEntity {

    private String name;
    private String type;
    private double weight;
    private double price;
    private String color;
    private Owner owner;

}
