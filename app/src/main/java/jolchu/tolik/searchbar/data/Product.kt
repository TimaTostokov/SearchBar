package jolchu.tolik.searchbar.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String,
    val numberQR: String
)