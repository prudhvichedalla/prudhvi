package don.gwtfrontend.main;

import don.gwtfrontend.main.presenters.impl.live.MainModuleLayoutManagerPresenter;

import com.mvp4g.client.annotation.Events;
import com.mvp4g.client.event.EventBus;

@Events(startPresenter = MainModuleLayoutManagerPresenter.class)
public interface MainEventBus extends EventBus {


}
