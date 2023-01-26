import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ServerTest {

    Server server;
    Guest guest;
    Guest guest2;

    @BeforeEach
    public void setUp() {

        server = new Server();
        guest = new Guest("Rashawn", 24, 100, 75, "Yes");
        guest2 = new Guest("Skye", 16, 2, 40, "No");
    }


    // 1. ARRANGE, 2. ACT, 3. ASSERT

    // TODO: test that guest can only get served if over 18
    @Test
    void guestIsAbove18() {
        Boolean isGuestAbove18 = server.canServeGuest(guest);
        assertThat(isGuestAbove18).isEqualTo(true);
    }

    @Test
    void guest2IsAbove18() {
        Boolean isGuest2Above18 = server.canServeGuest(guest2);
        assertThat(isGuest2Above18).isEqualTo(false);
    }

    // CheckAge

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)

    @Test
    void guestHasEnoughMoney() {
        Boolean doesGuest2HaveEnoughMoney = server.checkGuestHasEnoughMoney(100);
        assertThat(doesGuest2HaveEnoughMoney).isEqualTo(true);
    }

    @Test
    void guest2HasEnoughMoney() {
        Boolean doesGuest2HaveEnoughMoney = server.checkGuestHasEnoughMoney(2);
        assertThat(doesGuest2HaveEnoughMoney).isEqualTo("I'm sorry, you don't have enough money to purchase a drink");
    }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)
     @Test
    void whetherGuestIsSoberEnough() {
        Boolean isGuestSoberEnough = server.isGuestSoberEnough(75);
        assertThat(isGuestSoberEnough).isEqualTo(true);
     }

    @Test
    void whetherGuest2IsSoberEnough() {
        Boolean isGuest2SoberEnough = server.isGuestSoberEnough(40);
        assertThat(isGuest2SoberEnough).isEqualTo(false);
    }

    // TODO: test that guest can only get served if guest is not banned from the pub
    @Test
    void guestIsBannedOrNot() {
        Boolean hasGuestBeenBannedFromPub = server.hasGuestBeenBannedFromPub("Yes");
        assertThat(hasGuestBeenBannedFromPub).isEqualTo(true);
    }
    @Test
    void guest2IsBannedOrNot() {
        Boolean hasGuest2BeenBannedFromPub = server.hasGuestBeenBannedFromPub("No");
        assertThat(hasGuest2BeenBannedFromPub).isEqualTo(false);
    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)
    void guestHasCorrectCurrency() {

    }

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}

