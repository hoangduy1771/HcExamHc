import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Player {
//    HC Java exam
        private String name;
        private Integer age;

        private final Player.Position Position;
        public enum Position {
                GK, DF, MF, FW
        }

        public Player(final String name,
                            final int age,
                            final Position position) {
                this.name = name;
                this.age = age;
                this.Position = position;
        }

}




