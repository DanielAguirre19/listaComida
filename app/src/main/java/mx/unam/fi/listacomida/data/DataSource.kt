package mx.unam.fi.listacomida.data

import mx.unam.fi.listacomida.R
import mx.unam.fi.listacomida.model.Platillo

class DataSource {
    fun LoadPlatillos():List<Platillo> {
        return listOf<Platillo>(
            Platillo(R.string.desayuno, R.drawable.desayuno, 0.0, R.string.of_desayuno),
            Platillo(R.string.hamburger, R.drawable.hamburger, 0.0, R.string.of_hamburger),
            Platillo(R.string.pizza, R.drawable.pizza, 0.0, R.string.of_pizza),
            Platillo(R.string.postre, R.drawable.postre, 0.0, R.string.of_postre),
            Platillo(R.string.pozole, R.drawable.pozole, 0.0, R.string.of_pozole),
            Platillo(R.string.tacos, R.drawable.tacos, 0.0, R.string.of_tacos)
        )
    }
}