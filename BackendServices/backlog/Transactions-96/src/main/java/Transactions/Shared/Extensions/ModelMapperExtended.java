package Transactions.Shared.Extensions;

import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class ModelMapperExtended {

   public   <S, T> List<T> mapList(List<S> source, Class<T> targetClass) {
        return source
                .stream()
                .map(element -> new ModelMapper().map(element, targetClass))
                .collect(Collectors.toList());
    }



}
