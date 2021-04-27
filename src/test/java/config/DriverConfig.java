package config;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.LoadType.MERGE;

@Config.LoadPolicy(MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/driver.properties"
})
public interface DriverConfig extends Config{

    @Key("web.browser.is.remote")
    boolean webBrowserIsRemote();

    @Key("web.browser")
    String webBrowser();

    @Key("web.browser.version")
    String webBrowserVersion();

    @Key("web.browser.size")
    String webBrowserSize();

    @Key("web.browser.mobile.view")
    String webBrowserMobileView();

    @Key("web.remote.driver.domain")
    String webRemoteDriverDomain();

    @Key("web.remote.driver.url.format")
    String webRemoteDriverUrlFormat();

    @Key("web.remote.driver.user")
    String webRemoteDriverUser();

    @Key("web.remote.driver.password")
    String webRemoteDriverPassword();

    @Key("video.storage.format")
    String videoStorageFormat();
}
