package org.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LowFatYoghurtTest {
    @Test
    public void low_fat_yoghurt_calories_should_be_under_300() {
        LowFatYoghurt lowFatYoghurt = new LowFatYoghurt();

        assertThat(lowFatYoghurt.getCalories()).isLessThan(300);
    }
}
