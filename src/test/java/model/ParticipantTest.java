package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class ParticipantTest {

    @DisplayName("참여할 사람의 이름은 5자를 초과할 수 없다.")
    @Test
    void validateNameLength() {
        String given = "123456";
        assertThatThrownBy(() -> new Participant(given))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("참여할 사람의 이름은 null이거나 공백이면 안된다.")
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"\t", "\n"})
    void validateNameNotNullAndNotBlank(String given) {
        assertThatThrownBy(() -> new Participant(given))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
