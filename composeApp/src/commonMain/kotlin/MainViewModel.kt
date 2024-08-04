import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel : ViewModel() {
    private val initialCocktailList = listOf(
        "Mojito",
        "Margarita",
        "Piña Colada",
    )
    private val _cocktailList = MutableStateFlow(initialCocktailList)
    val cocktailList: StateFlow<List<String>> = _cocktailList
}