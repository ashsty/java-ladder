package ladder.domain.ladder;

public class Height {
    private final static int MINIMUM_HEIGHT = 2;
    private final int height;

    public Height(int height) {
        validateNegative(height);
        validateTooSmall(height);
        this.height = height;
    }

    private void validateNegative(int height) {
        if (height < 0) {
            throw new IllegalArgumentException("높이는 음수일 수 없습니다.");
        }
    }

    private void validateTooSmall(int height) {
        if (height < MINIMUM_HEIGHT) {
            throw new IllegalArgumentException("높이는 2 이상이어야 합니다.");
        }
    }

    public int getHeight() {
        return height;
    }
}