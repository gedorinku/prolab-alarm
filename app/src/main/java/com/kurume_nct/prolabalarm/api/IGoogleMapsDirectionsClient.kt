package com.kurume_nct.prolabalarm.api

import com.google.maps.model.AddressComponent
import org.joda.time.DateTime

/**
 * Created by gedorinku on 2017/03/05.
 */
interface IGoogleMapsDirectionsClient {

    /**
     * 指定した到着時刻に着くための出発時刻を返す．
     */
    fun getDepartureTime(
            arrivalTime: DateTime,
            origin: AddressComponent,
            destination: AddressComponent)
            : DateTime
}