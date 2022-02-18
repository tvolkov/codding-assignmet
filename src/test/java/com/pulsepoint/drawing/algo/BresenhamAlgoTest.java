package com.pulsepoint.drawing.algo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.pulsepoint.drawing.primitive.Colour;
import com.pulsepoint.drawing.primitive.Pixel;
import com.pulsepoint.drawing.primitive.Point;
import com.pulsepoint.drawing.primitive.Shape;
import java.util.Arrays;
import org.apache.commons.collections4.IterableUtils;
import org.junit.jupiter.api.Test;

public class BresenhamAlgoTest {

  private final BresenhamAlgo algo = new BresenhamAlgo();

  @Test
  public void drawLine() {
    Shape line = algo.drawLine(new Point(0, 1), new Point(6, 4), new Colour('x'));

    assertEquals(
        Arrays.asList(
            new Pixel(0, 1, 'x'),
            new Pixel(1, 1, 'x'),
            new Pixel(2, 2, 'x'),
            new Pixel(3, 2, 'x'),
            new Pixel(4, 3, 'x'),
            new Pixel(5, 3, 'x'),
            new Pixel(6, 4, 'x')),
        IterableUtils.toList(line));
  }
}
