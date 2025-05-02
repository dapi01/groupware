package org.codenova.groupwareback.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class AddBoard {
    @NotBlank
    private String title;
    @NotBlank
    private String content;
}
