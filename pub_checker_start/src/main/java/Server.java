public class Server {

    // Methods
    public boolean canServeGuest(Guest guest) {
        if (checkAge(guest.getAge()) && checkGuestHasEnoughMoney(guest.getWallet()) && isGuestSoberEnough(guest.getSobriety())
                && hasGuestBeenBannedFromPub(guest.getBannedFromPub())) {
            return true;
        }

        return false;
    }

    public boolean checkAge(int age) {
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

    public boolean hasGuestBeenBannedFromPub(String bannedFromPub ) {
        if ( bannedFromPub == "Yes") {
            return true;
        } else {
            return false;
        }
    }

    // Methods
//    public String checkGuestsAge(int age) {
//        if (age >= 18) {
//            return "You are old enough to get served!";
//        } else if (age < 18) {
//            return "I'm sorry, you are not old enough to get served!";
//        } else { return null; }
//    }
}
