package co.com.Choucair.tasks;

import co.com.Choucair.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUserPrueba implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.REGISTER),
                SendKeys.of("luis").into(Personal.FIRSTNAME),
                SendKeys.of("guerrero").into(Personal.LASTNAME),
                SendKeys.of("luisjorgueji@gmail.com").into(Personal.EMAIL),
                SendKeys.of("march").into(Personal.MONTH),
                SendKeys.of("13").into(Personal.DAY),
                SendKeys.of("1994").into(Personal.YEAR),
                Click.on(Personal.NEXTLOCATION),
                Click.on(Location.BUTTONLOCATION),
                Click.on(Devices.SISTEMA),
                Click.on(Devices.WINDOWS),
                Click.on(Devices.VERSION),
                Click.on(Devices.XP),
                Click.on(Devices.LANGUAJE),
                Click.on(Devices.ENGLISH),
                Click.on(Devices.BOTTONLASTFINAL),
                SendKeys.of("Adfddh9413*").into(Complete.PASSWORD),
                SendKeys.of("Adfddh9413*").into(Complete.CONFIRMPASSWORD),
                Click.on(Complete.CHECKONE),
                Click.on(Complete.CHECKTWO),
                Click.on(Complete.BUTTONCOMPLETE)


        );
    }
    public static RegisterUserPrueba makeinformation(){
        return instrumented(RegisterUserPrueba.class);
    }
}
