package com.xq.weini.guanyi.entity.result;

import java.util.List;
import lombok.Data;

@Data
public class WnOrdPullResult {

  private List<WnOrdPull> Orders ;

  private int TotalResults;

}
