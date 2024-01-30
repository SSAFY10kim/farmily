import { useState, useEffect } from 'react';
import { useDispatch } from 'react-redux';
import { useNavigate } from 'react-router-dom';
import { setUser } from '../store/auth';

export default function RedirectPage() {
  const dispatch = useDispatch();
  const navigate = useNavigate();

  const urlParams = new URL(location.herf).searchParams;

  const accessToken = urlParams.get('code');

  dispatch(setUser({ accessToken: accessToken }));

  useEffect(() => {
    navigate('/');
  }, []);

  return <></>;
}
