package model;

import lombok.Builder;
import lombok.Data;

/**
 * @author Igor Hnes on 9/14/17.
 */

@Data
@Builder
public class Owner extends AbstractEntity {

    private String name;
    private String jobPosition;
}
