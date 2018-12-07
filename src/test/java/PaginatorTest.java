import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class PaginatorTest {


    @Test
            public void multipleChunks () {
        Paginator paginator = new Paginator();
        String input = "Carpi foziness feculence elevenses unwinged necessitating hinduized nectareously oscillate celina heliotropism coronally peppier pirandello. Judicial arrears unmanipulatable unbandaging thalassic outfeeding embryulcuses antaeus chlorinity nicene nondetachable constitutor pavid kachina. Tannage reexspï¾¢rt excellence trichotomy riebeckite antignostic proctodeum equitableness preimportance enneastyle semaphore lugones taku gumweed. Misbuilt nyack nonlarcenous ernest lochus robustly elsinore elongate unurban onerousness matelasse camacho willabel pseudofeminine. Substantivise haushofer ashen impatiently noncultured preallied hendecagonal outtorn advisable balkanite guillemot holdall harte unbedimmed.\n" +
                "\n" +
                "Aspergilla tumulose noncontraband cab louden dollfuss vulvitis brad superfort gutted germanically dominee sylva durex. Frizz empyema kashmiris liquated citable dmso zambese inartistic unspelt underran premundane monotrichous phosphatised celebrezze. Macadamise underhanging wellhouse unhaltering lamenter pontifically preadjustment nonperseverant okinetic clavae proteinuria broadleaf summonses nickeliferous. Hectocotyli admix syngman cartelism victorine liquefier wodge impasted expressible iridosmium demogorgon diagnosed squeakingly treviso. Tricyclic prosopopoeia chullpa plinthless northeastwards fulgourous latterly unclean shakeout unjoyful balaamite postulantship morass recultivation.\n" +
                "\n" +
                "Utilizing setaceous espying suffuse securable vagabondish alme suspicionless froufrou scatted leonia nonderogative dieppe dominating. Insurrectionary passivate anthropomorphised assuan spangler pumice derivable politeness inosculate luminous divide hierarchise nonideologic dilatometric. Swordbill semiwarfare freethinking loessal tusche kingsley apropos baresthesia cooey scotopia unsaccharine spraylike cleostratus hellbent. Occidentalize venustiano unstaid phys rgenogram lehr planospore intercommunicated nonmyopically lankly mesothoraxes liquefacient gwendolyn emerald. Threesome stanleyville auspices niamey unhistory fath vener beth urbanity atrocious forsete lustiness tater realizability.";
        assertTrue( paginator.paginate(input).length>1);

    }
    @Test
    public void correctNumberOfChunks (){
        Paginator paginator = new Paginator();
        String input = "CarpifozinessfeculenceelevensesunwingednecessitatinghinduizedCarpifozinessfeculenceelevensesunwingednecessitatinghinduized";
        assertTrue(paginator.paginate(input).length ==5);
    }
}
