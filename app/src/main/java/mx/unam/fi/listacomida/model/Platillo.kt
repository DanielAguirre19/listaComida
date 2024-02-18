package mx.unam.fi.listacomida.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import java.sql.RowId

data class Platillo(
    @StringRes val stringResourceId: Int,
    @DrawableRes val drawableResourceId: Int,
    val precio: Double,
    @StringRes val stringResourceIdOferta: Int,
    )
