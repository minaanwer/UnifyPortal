package Transactions.Shared.Extensions;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.stream.Collectors;

public class ModelMapperExtension<S,D> {

    Class<D> targetClass ;


    public   <S, T> List<T> map(List<S> source, Class<T> targetClass) {
        return source
                .stream()
                .map(element -> new ModelMapper().map(element, targetClass))
                .collect(Collectors.toList());
    }


    public Page<D> map(Page<S> objects , Class<D> targetClass) {
        this.targetClass = targetClass ;
        Page<D> dtos  = objects.map(this::map);
        return dtos;
    }

    private D map(S o) {
        return new ModelMapper().map(o,targetClass);
    }
}