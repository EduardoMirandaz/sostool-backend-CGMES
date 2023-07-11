package dto;

import lombok.Getter;

import java.util.List;

@Getter
public class ResponsibilityDTO {

    private Integer id;
    private String description;
    private List<Object> sonResponsibilities;

}
