package org.codenova.groupwareback.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddChat {

    private String message;
}

