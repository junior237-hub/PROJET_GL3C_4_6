import static org.junit.jupiter.api.Assertions.*;

class PersonnnesTest {

     Personne pers = new Personne ();
     Montre m = new Montre ( h: 9, min: 25);


     @Test
     void porterMontre(){
          pers.porterMontre(m);
          assertNotNull(pers.montre);

     }
          @Test
     void enleverMontrer(){
          pers.enleverMontre ();
          assertNull(pers.montre);
          }

          @Test
     void afficherheure (){
          pers.porterMontre(m);
          assertEquals ( expected: "9h25", pers.afficherHeure());
     }
}