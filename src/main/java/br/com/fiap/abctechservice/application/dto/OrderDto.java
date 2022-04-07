package br.com.fiap.abctechservice.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDto {
    /**
     * ```json
     * {
     * "operator_id" : 0,
     * "services" : [1 , 2, 3],
     * "start" : {
     * 	"latitude" : 0.0,
     * 	"longitude" : 0.0,
     * 	"datetime" : "2022-02-19 00:00:00"
     * },
     * "end" : {
     * 	"latitude" : 0.0,
     * 	"longitude" : 0.0,
     * 	"datetime" : "2022-02-19 00:00:00"
     * }
     * ```
     */

    @NotNull
    @Positive
    private Long operatorId;
    @NotEmpty
    @NotNull
    private List<Long> services;
    private OrderLocationDto start;
    private OrderLocationDto end;


}