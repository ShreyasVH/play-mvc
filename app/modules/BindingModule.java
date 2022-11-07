package modules;

import com.google.inject.AbstractModule;
import services.IndexService;
import services.impl.IndexServiceImpl;

public class BindingModule extends AbstractModule
{
    protected void configure()
    {
        bind(IndexService.class).to(IndexServiceImpl.class);
    }
}