package services.impl;

import com.google.inject.Inject;
import repositories.IndexRepository;
import services.IndexService;

public class IndexServiceImpl implements IndexService
{
    private final IndexRepository indexRepository;

    @Inject
    public IndexServiceImpl(IndexRepository indexRepository)
    {
        this.indexRepository = indexRepository;
    }

    public String index()
    {
        return this.indexRepository.index();
    }
}
