package ru.demonstration.project.web.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import ru.demonstration.project.utils.enums.Name;
import ru.demonstration.project.utils.enums.Target;
import ru.demonstration.project.utils.enums.UserStatus;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@AllArgsConstructor
@Schema(description = "hotel guest")
public class WebClientHotelGuestDto {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private Name name;
    @JsonProperty("last_target")
    private Target target;
    @JsonProperty("status")
    private UserStatus status;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
