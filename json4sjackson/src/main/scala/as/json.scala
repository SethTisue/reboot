package reboot.as.json4s

import org.json4s._
import org.json4s.jackson.JsonMethods._
import com.ning.http.client.Response

object Json extends (Response => JValue) {
  def apply(r: Response) =
    (reboot.as.String andThen (s => parse(StringInput(s), true)))(r)
}
