package annotation.validator;

public class Team {

    @NotEmpty(message = "팀 이름이 비었습니다.")
    private String name;

    @Range(min = 1, max = 100, message = "팀 멤버 수는 1~100 사이여야 합니다.")
    private int memberCount;

    public Team(String name, int memberCount) {
        this.name = name;
        this.memberCount = memberCount;
    }

    public String getName() {
        return name;
    }

    public int getMemberCount() {
        return memberCount;
    }
}
