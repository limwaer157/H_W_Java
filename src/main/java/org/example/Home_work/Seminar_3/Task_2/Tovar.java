package org.example.Home_work.Seminar_3.Task_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
// Получить наименования товаров заданного сорта с наименьшей ценой.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tovar {
    private String country;
    private  Double volume;
    private Integer price;
    private Integer sort;
}
