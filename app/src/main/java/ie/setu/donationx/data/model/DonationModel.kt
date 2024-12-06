package ie.setu.donationx.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.firebase.firestore.DocumentId
import com.google.gson.annotations.SerializedName
import java.util.Date

@Entity
data class DonationModel(
    @DocumentId val _id: String = "N/A",
    val paymentType: String = "N/A",
    val paymentAmount: Int = 0,
    var message: String = "Go Homer!",
    val dateDonated: Date = Date(),
    val dateModified: Date = Date(),
    var email: String = "joe@bloggs.com"
)

val fakeDonations = List(30) { i ->
    DonationModel(
        _id = "12345" + i,
        "PayPal $i",
        i.toInt(),
        "Message $i",
        Date(),
        Date()
    )
}
