package pl.jedrik94.liskov_substitution_principle.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rectangle {
    protected int width, height;

    public int getArea() {
        return width * height;
    }
}
