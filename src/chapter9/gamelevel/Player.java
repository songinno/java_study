package chapter9.gamelevel;

public class Player {
    // Player가 가지는 레벨
    private PlayerLevel level;

    public Player() {
        level = new BegginerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    // 레벨 변경 메서드
    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count) {
        level.go(count);
    }
}
