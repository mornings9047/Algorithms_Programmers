package level01;

public class RenewalId {
    private String id;

    public String solution(String new_id) {
        this.id = new_id;
        convertUppercaseToLowercase()
                .removeSpecialCharacters()
                .replaceSerialDotsIntoSingleDot()
                .removeFirstAndLastDot()
                .checkIsIdEmpty()
                .checkIdLength();
        return this.id;
    }

    public RenewalId convertUppercaseToLowercase() {
        this.id = this.id.toLowerCase();
        return this;
    }

    public RenewalId removeSpecialCharacters() {
        String specialCharacters = "[~!@#$%^&*()=+\\[{\\]}:?,<>/]";
        this.id = id.replaceAll(specialCharacters, "");
        return this;
    }

    public RenewalId replaceSerialDotsIntoSingleDot() {
        StringBuilder builder = new StringBuilder();
        String[] split = id.split("");
        for (int i = 0; i < split.length; i++) {
            builder.append(split[i]);
            if (split[i].equals(".")) {
                while (split[i].equals(".")) {
                    i++;
                    if (i >= id.length())
                        break;
                }
                i--;
            }
        }
        this.id = builder.toString();
        return this;
    }

    public RenewalId removeFirstAndLastDot() {
        StringBuilder builder = new StringBuilder(id);
        if (builder.charAt(0) == '.')
            builder.replace(0, 1, "");
        if (builder.length() != 0)
            if (builder.charAt(builder.length() - 1) == '.')
                builder.replace(builder.length() - 1, builder.length(), "");
        this.id = builder.toString();
        return this;
    }

    public RenewalId checkIsIdEmpty() {
        if (this.id.isEmpty())
            this.id = "a";
        return this;
    }

    public RenewalId checkIdLength() {
        if (this.id.length() > 15) {
            this.id = this.id.substring(0, 15);
            this.id = removeLastDot();
        } else if (id.length() < 3) {
            StringBuilder idBuilder = new StringBuilder(this.id);
            while (idBuilder.length() < 3)
                idBuilder.append(idBuilder.charAt(idBuilder.length() - 1));
            this.id = idBuilder.toString();
        }
        return this;
    }

    public String removeLastDot() {
        int index = this.id.length() - 1;
        while (this.id.charAt(index) == '.')
            index--;
        return this.id.substring(0, ++index);
    }

    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        String new_id2 = "z-+.^.";
        String new_id3 = "=.=";
        String new_id4 = "123_.def";
        String new_id5 = "abcdefghijklmn.p";

        RenewalId renewalId = new RenewalId();
        System.out.println(renewalId.solution(new_id));
        System.out.println(renewalId.solution(new_id2));
        System.out.println(renewalId.solution(new_id3));
        System.out.println(renewalId.solution(new_id4));
        System.out.println(renewalId.solution(new_id5));
    }
}
