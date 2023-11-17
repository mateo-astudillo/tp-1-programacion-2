package exercise_10;

public class ClientVIP extends Client {
    private final float discount = 0.1F;

    @Override
    public boolean buy(Pet pet) {
        if (this.balance - pet.price < 0) {
            return false;
        }
        this.balance -= (pet.price - pet.price * discount) ;
        this.pets.add(pet);
        return false;
    }
}
