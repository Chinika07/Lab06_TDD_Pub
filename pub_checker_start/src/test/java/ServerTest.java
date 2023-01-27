import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ServerTest {

    Server server;
    Guest guest;
    Guest guest2;

    Guest favouriteDrink;

    @BeforeEach
    public void setUp() {

        server = new Server();
        guest = new Guest("Rashawn", 24,100, 75, "Yes", '£');
        guest2 = new Guest("Skye", 16,2, 40, "No", '$');
    }

    // 1. ARRANGE, 2. ACT, 3. ASSERT

    // TODO: test that guest can only get served if over 18

    @Test
    void ifGuestIsOver18() {
        Boolean isGuestOver18 = server.isGuestOver18(24);
        assertThat(isGuestOver18).isEqualTo(true);
    }

    @Test
    void ifGuest2IsOver18() {
        Boolean isGuest2Over18 = server.isGuestOver18(16);
        assertThat(isGuest2Over18).isEqualTo(false);
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)

    @Test
    void guestHasEnoughMoney() {
        Boolean doesGuestHaveEnoughMoney = server.checkGuestHasEnoughMoney(100);
        assertThat(doesGuestHaveEnoughMoney).isEqualTo(true);
    }

    @Test
    void guest2HasEnoughMoney() {
        Boolean doesGuest2HaveEnoughMoney = server.checkGuestHasEnoughMoney(2);
        assertThat(doesGuest2HaveEnoughMoney).isEqualTo(false);
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
        assertThat(hasGuestBeenBannedFromPub).isEqualTo(false);
    }
    @Test
    void guest2IsBannedOrNot() {
        Boolean hasGuest2BeenBannedFromPub = server.hasGuestBeenBannedFromPub("No");
        assertThat(hasGuest2BeenBannedFromPub).isEqualTo(true);
    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)
    @Test
    void guestHasCorrectCurrency() {
        Boolean doesGuestHaveTheCorrectCurrency = server.doesGuestHaveTheCorrectCurrency('£');
        assertThat(doesGuestHaveTheCorrectCurrency).isEqualTo(true);
    }

    @Test
    void guest2HasCorrectCurrency() {
        Boolean doesGuest2HaveTheCorrectCurrency = server.doesGuestHaveTheCorrectCurrency('$');
        assertThat(doesGuest2HaveTheCorrectCurrency).isEqualTo(false);
    }

    
}

