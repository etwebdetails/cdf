package org.pentaho.cdf.environment.paths;

public interface ICdfApiPathProvider {

  /**
   * @return abs path to renderer api, no trailing slash
   */
  public String getRendererBasePath();

  /**
   * @return abs path to static content access
   */
  public String getPluginStaticBaseUrl();

  /**
   * @return abs path to static content access
   */
  public String getViewActionUrl();

}
