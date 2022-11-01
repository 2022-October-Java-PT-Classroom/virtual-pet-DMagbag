package virtual_pet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VirtualPetTest {
    VirtualPet underTest = new VirtualPet(50, 50, 50, 0);

    @Test
    public void shouldHaveDefaultHealthOf50() {
        int actualHealth = underTest.getHealth();
        Assertions.assertEquals(50, actualHealth);
    }

    @Test
    public void shouldHaveDefaultEnergyOf50() {
        int actualEnergy = underTest.getEnergy();
        Assertions.assertEquals(50, actualEnergy);
    }

    @Test
    public void shouldHaveDefaultRageOf50() {
        int actualRage = underTest.getRage();
        Assertions.assertEquals(50, actualRage);
    }

    @Test
    public void shouldHaveDefaultSkillLevelOf0() {
        int actualSkillLevel = underTest.getSkillLevel();
        Assertions.assertEquals(0, actualSkillLevel);
    }

    @Test
    public void rideShouldDecreaseEnergyFromInitialEnergyOf50to40() {
        underTest.ride();
        int actualEnergy = underTest.getEnergy();
        Assertions.assertEquals(40, actualEnergy);
    }

    @Test
    public void trainShouldIncreaseSkillLevelFromInitialSkillLevelOf0to1() {
        underTest.train();
        int actualSkillLevel = underTest.getSkillLevel();
        Assertions.assertEquals(1, actualSkillLevel);
    }

    @Test
    public void petShouldDecreaseRageFromInitialRageOf50to40() {
        underTest.pet();
        int actualRage = underTest.getRage();
        Assertions.assertEquals(40, actualRage);
    }

    @Test
    public void feedShouldIncreaseHealthFromInitialHealthOf50to60() {
        underTest.feed();
        int actualHealth = underTest.getHealth();
        Assertions.assertEquals(60, actualHealth);
    }

    @Test
    public void putToSleepShouldIncreaseEnergyFromInitialEnergyOf50to60() {
        underTest.putToSleep();
        int actualEnergy = underTest.getEnergy();
        Assertions.assertEquals(60, actualEnergy);
    }

    @Test
    public void tickShouldDecreaseHealthFromInitialHealthOf50to45() {
        underTest.tick();
        int actualHealth = underTest.getHealth();
        Assertions.assertEquals(45, actualHealth);
    }
}