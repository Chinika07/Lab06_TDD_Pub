
public class Server {

    // Methods
    public boolean canServeGuest(Guest guest) {
        if (guestIsAbove18(guest.getAge()) && checkGuestHasEnoughMoney(guest.getWallet()) && isGuestSoberEnough(guest.getSobriety())
                && hasGuestBeenBannedFromPub(guest.getBannedFromPub()) && doesGuestHaveTheCorrectCurrency(guest.getCurrency())){
            return true;
        }

        return false;
    }


        public boolean guestIsAbove18(int age) {
        return age >= 18;
    }

    public boolean checkGuestHasEnoughMoney(int wallet) {
        if (wallet >= 5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isGuestSoberEnough(int sobriety) {
        if (sobriety >= 50) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasGuestBeenBannedFromPub(String bannedFromPub) {
        if (bannedFromPub == "No") {
            return true;
        } else {
            return false;
        }
    }

    public boolean doesGuestHaveTheCorrectCurrency(char currency) {
        if (currency == '£') {
            return true;
        } else {
            return false;
        }
    }

}
