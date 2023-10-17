package exercise_4;

public class Patient extends Person {
    private float weight;
    private float height;
    private String sex;

    public float bodyMassIndex() {
        return this.getWeight() / (this.getHeight() * this.getHeight());
    }
    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        if (sex.equals("m")) {
            this.sex = "maculino";
        } else if (sex.equals("f")) {
            this.sex = "femenino";
        }
    }

    public float getWeight() {
        return this.weight;
    } public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String bodyMassIndexDescription() {
        float imc = this.bodyMassIndex();
        if (imc < 18.5) {
            return "Peso inferior al normal";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Peso superior al normal";
        } else if (imc >= 30) {
            return "Obesiadad";
        }
        return "";
    }
}
