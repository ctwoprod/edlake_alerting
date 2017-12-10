package id.co.danamon.repo

import id.co.danamon.model.Pic

/**
  * Created by welly on 11/29/2017.
  */
class PicRepository {
  def save(pic: Pic) = {

  }

  def getPicBySeverity(getSeverity: CharSequence): Pic  = {
    if(getSeverity=="error")
      Pic(1, "Roberto")
    else //warning
      Pic(2, "Fernandez")  
  }
}
