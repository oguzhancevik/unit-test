package io.github.oguzhancevik.unittest.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Gift {
  private String name;
}
