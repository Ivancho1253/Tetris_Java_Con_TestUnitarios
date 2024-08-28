package com.example;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@SpringBootConfiguration

class EjercitoTest {

  @Test
  void soldado_muere_con_un_disparo_test() {

    Soldado soldado = new Soldado();

    soldado.recibirDisparo();
    assert soldado.estaVivo() == false;
  }

  @Test
  void soldado_vivo_pregunta_si_tiene_vida_test(){

    Soldado soldado = new Soldado();
    assert soldado.estaVivo() == true;

  }

  @Test
  void soldado_muerto_pregunta_si_tiene_vida_test(){

    Soldado soldado = new Soldado();

    soldado.recibirDisparo();
    assert soldado.estaVivo() == false;
  
  }

  @Test
  void soldado_dispara_a_otro_soldado(){

    Soldado soldado1 = new Soldado();
    Soldado soldado2 = new Soldado();

    soldado1.disparar(soldado2);

    assert soldado2.estaVivo() == false;

  }

  @Test
  void soldado_dispara_a_otro_soldado_con_escudo_test(){

    Soldado soldado1 = new Soldado();
    Soldado soldado2 = new Soldado();
    
    Escudo esc = new Escudo();

    esc.setPorcentaje(50);
    soldado2.escudo = esc;
    
    soldado1.disparar(soldado2);

    assert soldado2.estaVivo() == true;
  }

  @Test
  void soldado_dispara_a_tanque_test(){

    Soldado soldado = new Soldado();
    Tanque tanque = new Tanque();

    soldado.disparar(tanque);
    assert tanque.getVida() == 1;
    assert tanque.estaVivo() == true;
  }

  @Test
  void soldado_con_escudo_no_muere_de_un_disparo_test(){

    Soldado soldado = new Soldado();
    Escudo esc1 = new Escudo();

    esc1.setPorcentaje(50);
    soldado.setEscudo(esc1);

    assert esc1.getPorcentaje() == 50;
    soldado.recibirDisparo();
    assert soldado.estaVivo() == true;

  }

  @Test
  void tanque_no_muere_con_un_disparo_test() {

    Tanque tanque = new Tanque();
    tanque.recibirDisparo();

    assert tanque.estaVivo() == true;
  }

  @Test 
  void tanque_muere_con_dos_disparos_test(){
    Tanque tanque = new Tanque();

    tanque.recibirDisparo();
    tanque.recibirDisparo();

    assert tanque.estaVivo() == false;
  }

  @Test
  void tanque_con_escudo_no_muere_con_dos_disparos_test(){
    Tanque tanque = new Tanque();

    Escudo esc1 = new Escudo();
    esc1.setPorcentaje(10);
    tanque.setEscudo(esc1);

    tanque.recibirDisparo();
    tanque.recibirDisparo();
    assert tanque.estaVivo() == true;
  }

  @Test 
  void buque_no_muere_con_un_disparo_test(){

    Buque buque = new Buque();

    buque.recibirDisparo();

    assert buque.estaVivo() == true;
  }

  @Test
  void buque_muere_con_tres_disparos_test(){
    Buque buque = new Buque();

    buque.recibirDisparo();
    buque.recibirDisparo();
    buque.recibirDisparo();

    assert buque.estaVivo() == false;
  }

  @Test
  void buque_con_escudo_no_muere_con_tres_disparos_test(){

    Buque buque = new Buque();
    Escudo esc1 = new Escudo();

    esc1.setPorcentaje(50);
    buque.setEscudo(esc1);

    buque.recibirDisparo();
    buque.recibirDisparo();
    buque.recibirDisparo();

    assert buque.estaVivo() == true;
  }

  @Test
  void soldado_dispara_a_chuckNorris_no_lo_mata_test(){

    Soldado soldado = new Soldado();
    ChuckNorris chuck = new ChuckNorris();

    soldado.dispararChuck(chuck);

    assert chuck.estaVivo() == true;
  }

  @Test
  void tanque_dispara_varias_veces_a_chuckNorris_no_lo_mata_test(){

    Tanque tanque = new Tanque();
    ChuckNorris chuck = new ChuckNorris();

    tanque.dispararChuck(chuck);
    tanque.dispararChuck(chuck);
    tanque.dispararChuck(chuck);
    tanque.dispararChuck(chuck);

    assert chuck.estaVivo() == true;
    
  }
}