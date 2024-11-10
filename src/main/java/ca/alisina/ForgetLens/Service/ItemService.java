package ca.alisina.ForgetLens.Service;

import ca.alisina.ForgetLens.Repo.ItemRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;
}
